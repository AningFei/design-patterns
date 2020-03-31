package com.fei.design.pattern.action.state;

/**
 * @Author Aning
 * @Date 2020/3/31 2:28 下午
 * @Version 1.0
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state)
    {
        hj=state.hj;
        stateName="中等";
        score=state.score;
    }
    @Override
    public void checkState()
    {
        if(score<60)
        {
            hj.setState(new LowState(this));
        }
        else if(score>=90)
        {
            hj.setState(new HighState(this));
        }
    }
}
