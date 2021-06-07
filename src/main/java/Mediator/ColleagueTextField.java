package Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-27 22:49
 **/
public class ColleagueTextField extends TextField implements TextListener,Colleague {
    private Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }
    public ColleagueTextField(String text,int columns){
        super(text,columns);
    }
    public void setColleagueEnabled(boolean enabled) {
        setEditable(enabled);
        setBackground(enabled?Color.white:Color.lightGray);
    }

    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
