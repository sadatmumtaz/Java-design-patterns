/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
class UniversityEmployees implements Subject {
    private List<Observer> observers;
    private IEmployee universityEmployees;

    public UniversityEmployees(IEmployee universityEmployees) {
        this.observers = new ArrayList<>();
        this.universityEmployees = universityEmployees;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Additional method to trigger notifications on change
    public void structureChanged() {
        notifyObservers();
    }

    public IEmployee getUniversityEmployees() {
        return universityEmployees;
    }

    public void setUniversityEmployees(IEmployee universityEmployees) {
        this.universityEmployees = universityEmployees;
        structureChanged();
    }
}
