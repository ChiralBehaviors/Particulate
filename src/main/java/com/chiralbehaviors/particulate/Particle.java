/** 
 * (C) Copyright 2014 Chiral Behaviors, LLC. All Rights Reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package com.chiralbehaviors.particulate;

import processing.core.PVector;

/**
 * @author hparry
 *
 */
public class Particle {
    
    private PVector location;
    private PVector velocity;
    private PVector acceleration;
    
    public Particle () {
        setLocation(new PVector(0, 0, 0));
        setVelocity(new PVector(0, 0, 0));
        setAcceleration(new PVector(0, 0, 0));
    }

    /**
     * @return the location
     */
    public PVector getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(PVector location) {
        this.location = location;
    }

    /**
     * @return the velocity
     */
    public PVector getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(PVector velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the acceleration
     */
    public PVector getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration the acceleration to set
     */
    public void setAcceleration(PVector acceleration) {
        this.acceleration = acceleration;
    }

}
