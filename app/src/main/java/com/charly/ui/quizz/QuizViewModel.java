package com.charly.ui.quizz;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.charly.data.Question;
import com.charly.data.QuestionRepository;

import java.util.List;
import java.util.Objects;

public class QuizViewModel extends ViewModel {

    private List<Question> questions;
    private final  QuestionRepository questionRepository;

    private Integer currentQuestionIndex=0;
    MutableLiveData<Question> currentQuestion=new MutableLiveData<>();
    MutableLiveData<Integer> score=new MutableLiveData<>(0);
    MutableLiveData<Boolean> isLastQuestion=new MutableLiveData<>(false);

    public QuizViewModel(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void startQuiz(){
        questions=questionRepository.getQuestions();
        currentQuestion.postValue(questions.get(0));
    }

    public Boolean isAnswerValid(int answerIndex){
        Question currentQuestion=Objects.requireNonNull(this.currentQuestion.getValue());
        Boolean isValid=currentQuestion.getAnswerIndex()==answerIndex;
        if(isValid){
            score.postValue(Objects.requireNonNull(score.getValue())+1);
        }
        return isValid;
    }

    public void nextQuestion(){
        int nextQuestionIndex=currentQuestionIndex+1;
        if(nextQuestionIndex<questions.size()){
            currentQuestionIndex=nextQuestionIndex;
            currentQuestion.postValue(questions.get(currentQuestionIndex));
            isLastQuestion.postValue(currentQuestionIndex==questions.size()-1);
        }
    }
}
