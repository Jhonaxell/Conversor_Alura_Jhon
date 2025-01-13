package conversorDeMonedas.Principal;
import java.util.Map;

public class TasaCambio {
    private String moneda_base;
    private Map<String, Double> Tasa_Conversion;

    public String getMonedaBase() {
        return moneda_base;
    }

    public Map<String, Double> getTasas() {
        return Tasa_Conversion;
    }
}
