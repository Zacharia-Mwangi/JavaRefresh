package Interfaces;

public class Option implements Instrument {
    @Override
    public String getAssetClass(){
        return " OPTIONS ";
    }
}
