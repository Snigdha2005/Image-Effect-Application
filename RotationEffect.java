package main.java.com.iiitb.imageEffectApplication.effects;
import com.iiitb.imageEffectApplication.exception.IllegalParameterException;
import com.iiitb.imageEffectApplication.libraryInterfaces.RotationInterface;
import com.iiitb.imageEffectApplication.libraryInterfaces.Pixel;
import com.iiitb.imageEffectApplication.service.LoggingService;
import com.iiitb.imageEffectApplication.baseEffects.DiscreteEffect;

public class RotationEffect implements DiscreteEffect{
    private int degrees = 0;
    public Pixel[][] apply(Pixel[][] image, String FileName, LoggingService loggingService){
        return RotationInterface.applyRotation(image, degrees);
    }
    public void selectOptionValue(String optionName, int value) throws IllegalParameterException{
        if (optionName.equals("90")){
            degrees = 90;
        }
        else if (optionName.equals("180")) {
            degrees = 180;
        }
        else if (optionName.equals("270")){
            degrees = 270;
        }
        else if (optionName.equals("0")){
            degrees = 0;
        }
        else{
            throw new IllegalParameterException();
        }
    }
}

