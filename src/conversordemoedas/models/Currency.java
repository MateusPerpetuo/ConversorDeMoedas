package conversordemoedas.models;

public class Currency {

    private String lastUpdate;
    private String currencyBaseCode;
    private String convertedCurrencyCode;
    private double amountToConvert;
    private double convertedAmount;

    // Contructors

    public Currency(String lastUpdate, String currencyBaseCode, String convertedCurrencyCode,
                    double amountToConvert, double convertedAmount) {
        this.lastUpdate = lastUpdate.substring(5,lastUpdate.length()-5);
        this.currencyBaseCode = currencyBaseCode;
        this.convertedCurrencyCode = convertedCurrencyCode;
        this.amountToConvert = amountToConvert;
        this.convertedAmount = convertedAmount;
    }

    // Methods

    @Override
    public String toString() {
        String msg = String.format( """
                Conversão realizada de %s para %s
                
                Moeda Inicial: %s
                Moeda Destino: %s
                Valor inicial: $%.2f %s
                Valor convertido: $%.2f %s
                
                Dados atualizado em %s
                """, this.currencyBaseCode, this.convertedCurrencyCode, this.currencyBaseCode,
                     this.convertedCurrencyCode, this.amountToConvert, this.currencyBaseCode,
                     this.convertedAmount, this.convertedCurrencyCode, this.lastUpdate);
        return msg;
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
