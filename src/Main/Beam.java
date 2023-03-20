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
class Beam extends Rectangle implements CalculateSpace {
    private double height;
    
    public Beam(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        return calculateArea() * height;
    }
}