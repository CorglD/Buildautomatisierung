package org.campus02.orgl;

public class BMICalculator {
    private double weightInKG;
    private double heightInMeters;

    public BMICalculator(double weightInKG, double heightInMeters) {
        this.weightInKG = weightInKG;
        this.heightInMeters = heightInMeters;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    private double calculateBMI(){
        return weightInKG/(heightInMeters*heightInMeters);
    }

    public String result(){
        double BMI = calculateBMI();

        if(BMI<18.5){
            return "underweight";
        }
        else if (BMI < 25) {
            return "normal";
        }
        else if (BMI<30) {
            return "overweight";
        }
        else {
            return "obese";
        }
    }
}
