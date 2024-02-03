package main.java.com.iiitb.imageEffectApplication.effects;
import com.iiitb.imageEffectApplication.exception.IllegalParameterException;
import com.iiitb.imageEffectApplication.libraryInterfaces.InvertInterface;
import com.iiitb.imageEffectApplication.libraryInterfaces.Pixel;
import com.iiitb.imageEffectApplication.service.LoggingService;
import com.iiitb.imageEffectApplication.baseEffects.PhotoEffect;

public class Invert implements PhotoEffect{
    public Pixel[][] apply(Pixel[][] image, String fileName, LoggingService loggingService){
        return InvertInterface.applyInvert(image);
    }
}
