/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
class Cylinder extends Circle implements CalculateSpace {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        return calculateArea() * height;
    }
}