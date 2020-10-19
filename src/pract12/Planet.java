package pract12;

enum Planet {
    EARTH   (5.976e+24, 6371),
    URANUS  (8.686e+25, 25362),
    NEPTUNE (1.024e+26, 24622);

    private final double mass;
    private final double radius;
    private static final double G = 6.67408E-11;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    public double getGravity() {
        return G * mass / Math.pow(radius*1000,2);
    }

}
