public class GravityCalculator {
    public static void main(String[] args) {
        //The output of the unmodified program was "The object's position after 10.0 seconds is 0.0 m."
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10;
        double initialPosition = 0.0;
        // formula for finding finalPosition is
        // finalPosition = (gravity * fallingTime^2) / 2 + initialVelocity * fallingTime + initialPosition
        // Use Math.pow to square fallingTime
        double finalPosition = (gravity * (Math.pow(fallingTime, 2)))/2
                + (initialVelocity * fallingTime) + initialPosition;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");

    }
}
