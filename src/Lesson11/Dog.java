package Lesson11;

public class Dog extends Animal {

    public Dog(String voice, int teeth) {
        setVoice(voice);
        setTeeth(teeth);
    }

    public String getVoice() { // переопределили метод
        String voice = super.getVoice();
        return voice + " guf-guf ";
    }

    void voiceDog() {
        System.out.println(getVoice() + " во все " + getTeeth() + " зуба");
    }

}
