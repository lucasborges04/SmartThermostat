public class SmartThermostat {
    private int temperature = 22;

    public void increaseTemperature(){
        int maxTemperature = 30;
        if(temperature + 1 > maxTemperature){
            System.out.println("Temperatura fora do limite permitido.");
            return;
        }

        temperature += 1;
        System.out.println("Temperatura aumentada: " + getTemperature() + " graus Celsius.");
    }

    public void decreaseTemperature(){
        int minTemperature = 16;
        if(temperature - 1 < minTemperature){
            System.out.println("Temperatura fora do limite permitido.");
            return;
        }

        temperature -= 1;
        System.out.println("Temperatura diminuida: " + getTemperature() + " graus Celsius.");
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
