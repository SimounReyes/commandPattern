package SHA;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args){

        Scanner eat = new Scanner(System.in);

        Light light = new Light();
        AirConditionUnit airConditionUnit = new AirConditionUnit();
        MusicPlayer musicPlayer = new MusicPlayer();

        CentralHub cb = new CentralHub();

        PowerOn lightsOn = new PowerOn(light);
        PowerOff lightsOff = new PowerOff(light);
        Plus lightsBrightUp = new Plus(light);
        Minus lightsBrightDown = new Minus(light);

        PowerOn acOn = new PowerOn(airConditionUnit);
        PowerOff acOff = new PowerOff(airConditionUnit);
        Plus acTempUP = new Plus(airConditionUnit);
        Minus acTempDown = new Minus(airConditionUnit);

        PowerOn musicPlayerOn = new PowerOn(musicPlayer);
        PowerOff musicPlayerOff = new PowerOff(musicPlayer);
        Plus musicPlayerVolUp = new Plus(musicPlayer);
        Minus musicPlayerVolDown = new Minus(musicPlayer);

        Integer num = 6;

        while(num!=5)
        {
            System.out.println("Choose your Appliances:");
            System.out.println("1. Lights");
            System.out.println("2. Air-Conditioning Unit");
            System.out.println("3. Music Player");
            System.out.println("4. Open All three appliances");
            System.out.println("5. Terminate Console");
            num = eat.nextInt();
            switch(num) {
                case 1:
                    cb.setCommand(lightsOn);
                    cb.clickButton();
                    cb.setCommand(lightsBrightUp);
                    cb.clickButton();
                    cb.setCommand(lightsBrightDown);
                    cb.clickButton();
                    cb.setCommand(lightsBrightUp);
                    cb.clickButton();
                    cb.setCommand(lightsBrightDown);
                    cb.clickButton();
                    cb.setCommand(lightsOff);
                    cb.clickButton();
                    break;
                case 2 :
                    cb.setCommand(acOn);
                    cb.clickButton();
                    cb.setCommand(acTempUP);
                    cb.clickButton();
                    cb.setCommand(acTempDown);
                    cb.clickButton();
                    cb.setCommand(acTempUP);
                    cb.clickButton();
                    cb.setCommand(acTempDown);
                    cb.clickButton();
                    cb.setCommand(acOff);
                    cb.clickButton();
                    break;
                case 3 :
                    cb.setCommand(musicPlayerOn);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolUp);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolDown);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolUp);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolDown);
                    cb.clickButton();
                    cb.setCommand(musicPlayerOff);
                    cb.clickButton();
                    break;
                case 4 :
                    cb.setCommand(lightsOn);
                    cb.clickButton();
                    cb.setCommand(lightsBrightUp);
                    cb.clickButton();
                    cb.setCommand(lightsBrightDown);
                    cb.clickButton();
                    cb.setCommand(lightsOff);
                    cb.clickButton();
                    cb.setCommand(acOn);
                    cb.clickButton();
                    cb.setCommand(acTempUP);
                    cb.clickButton();
                    cb.setCommand(acTempDown);
                    cb.clickButton();
                    cb.setCommand(acOff);
                    cb.clickButton();
                    cb.setCommand(musicPlayerOn);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolUp);
                    cb.clickButton();
                    cb.setCommand(musicPlayerVolDown);
                    cb.clickButton();
                    cb.setCommand(musicPlayerOff);
                    cb.clickButton();
                    break;
                case 5 :
                    System.out.println("terminating");
                    break;
                default:
            }

        }

    }
}