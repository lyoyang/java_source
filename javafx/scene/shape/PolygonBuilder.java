/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.shape;

/**
Builder class for javafx.scene.shape.Polygon
@see javafx.scene.shape.Polygon
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class PolygonBuilder<B extends javafx.scene.shape.PolygonBuilder<B>> extends javafx.scene.shape.ShapeBuilder<B> implements javafx.util.Builder<javafx.scene.shape.Polygon> {
    protected PolygonBuilder() {
    }

    /** Creates a new instance of PolygonBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.shape.PolygonBuilder<?> create() {
        return new javafx.scene.shape.PolygonBuilder();
    }

    private boolean __set;
    public void applyTo(javafx.scene.shape.Polygon x) {
        super.applyTo(x);
        if (__set) x.getPoints().addAll(this.points);
    }

    private java.util.Collection<? extends java.lang.Double> points;
    /**
    Add the given items to the List of items in the {@link javafx.scene.shape.Polygon#getPoints() points} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B points(java.util.Collection<? extends java.lang.Double> x) {
        this.points = x;
        __set = true;
        return (B) this;
    }

    /**
    Add the given items to the List of items in the {@link javafx.scene.shape.Polygon#getPoints() points} property for the instance constructed by this builder.
    */
    public B points(java.lang.Double... x) {
        return points(java.util.Arrays.asList(x));
    }

    /**
    Make an instance of {@link javafx.scene.shape.Polygon} based on the properties set on this builder.
    */
    public javafx.scene.shape.Polygon build() {
        javafx.scene.shape.Polygon x = new javafx.scene.shape.Polygon();
        applyTo(x);
        return x;
    }
}
