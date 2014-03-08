/*
 *  Copyright 2014 Abid Hasan Mujtaba
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;

/**
 * Main class for a LeJOS EV3 robot with a pencil/pen attached behind it tracing its path.
 */

public class Tracer
{
    private static RegulatedMotor motorR = Motor.D;
    private static RegulatedMotor motorL = Motor.A;

    private static int SPEED = 100;

    public static void main(String[] args)
    {
        log("Starting Program -> Tracer");

        initialize();

//        move(500);
        turn_right(200);

        log("Program ends");
    }


    private static void initialize()
    {
        motorR.setSpeed(SPEED);
        motorL.setSpeed(SPEED);
    }


    private static void move(int angle)
    {
        log(String.format("MOVE STRAIGHT - %d units", angle));

        motorR.rotate(angle, true);
        motorL.rotate(angle, false);
    }


    private static void turn_right(int angle)
    {
        log(String.format("TURN RIGHT - %d units", angle));

        motorR.stop();
        motorL.rotate(angle, false);
    }


    private static void log(String message)
    {
        System.out.println("log>\t" + message);
    }
}
