package com.fei.design.pattern.action.state;

/**
 * @Author Aning
 * @Date 2020/3/31 2:25 下午
 * @Version 1.0
 */
public class ScoreContext {

    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
