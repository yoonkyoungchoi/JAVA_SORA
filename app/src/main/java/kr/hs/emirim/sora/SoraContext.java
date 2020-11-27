package kr.hs.emirim.sora;

public class SoraContext {
    public String Questions;
    public String Answer;

    public SoraContext() {

    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public SoraContext(String Questions, String Answer) {
        this.Questions = Questions;
        this.Answer = Answer;
    }
}
