/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Builder;

/**
 *
 * @author user
 */
class Tea extends ColdDrink {
    private String sweetnessType;
    private boolean cream;
    private int sweetnessAmountInSpoons;

    public Tea() {
        this.sweetnessType = "Regular";
        this.cream = false;
        this.sweetnessAmountInSpoons = 0;
    }

    public void setSweetnessType(String sweetnessType) {
        this.sweetnessType = sweetnessType;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public void setSweetnessAmount(int sweetnessAmountInSpoons) {
        this.sweetnessAmountInSpoons = sweetnessAmountInSpoons;
    }

    @Override
    public float price() {
        float basePrice = 15.0f;
        float extras = 0.0f;
        if (cream) {
            extras += 5.0f;
        }
        return basePrice + extras;
    }

    @Override
    public String name() {
        return "Tea";
    }
}
