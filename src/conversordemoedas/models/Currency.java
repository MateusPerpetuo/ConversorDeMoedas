package conversordemoedas.models;

public class Currency {

    private String lastUpdate;
    private String currencyBaseCode;
    private String convertedCurrencyCode;
    private double amountToConvert;
    private double convertedAmount;

    // Contructors

    public Currency(String base_code, String lastUpdate) {
        this.currencyBaseCode = base_code;
        this.lastUpdate = lastUpdate;
    }


    // Getters and setters

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCurrencyBaseCode() {
        return currencyBaseCode;
    }

    public double getAmountToConvert() {
        return amountToConvert;
    }

    public void setAmountToConvert(double amountToConvert) {
        this.amountToConvert = amountToConvert;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getConvertedCurrencyCode() {
        return convertedCurrencyCode;
    }

    public void setConvertedCurrencyCode(String convertedCurrencyCode) {
        this.convertedCurrencyCode = convertedCurrencyCode;
    }
}
