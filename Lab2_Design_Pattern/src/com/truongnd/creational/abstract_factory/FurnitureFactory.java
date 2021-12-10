package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:52
 */
public class FurnitureFactory {
    private FurnitureFactory() {

    }

    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
