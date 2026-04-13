import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Cargo: " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
                // Try changing Petroleum → Coal to test failure case
        );

        boolean isSafe = bogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                                bogie.getCargo().equalsIgnoreCase("Petroleum")
                );

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}