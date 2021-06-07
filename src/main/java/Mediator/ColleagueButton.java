package Mediator;

import java.awt.*;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-27 22:46
 **/
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }
    public ColleagueButton(String caption){
        super(caption);
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
