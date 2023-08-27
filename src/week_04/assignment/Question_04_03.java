package week_04.assignment;

import java.util.Scanner;

public class Question_04_03 {

    public static void main(String[] args) {

        final double AVERAGE_EARTH_RADIUS = 6371.01;

        double atlantaY = -84.3879824;
        double atlantaX = 33.7489954;

        double orlandoY = -81.3792364999;
        double orlandoX = 28.5383355;

        double savannahY = -81.09983419999998;
        double savannahX = 32.0835407;

        double charlotteY = -80.84312669999997;
        double charlotteX = 35.2270869;

        double distanceFromOrlandoToSavannah = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(savannahX)) +
                Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahX)) *
                        Math.cos(Math.toRadians(orlandoY - savannahY)));

        double distanceFromOrlandoToAtlanta = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(atlantaX)) +
                Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaX)) *
                        Math.cos(Math.toRadians(orlandoY - atlantaY)));

        double distanceFromSavannahToAtlanta = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(atlantaX)) +
                        Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaX)) *
                                Math.cos(Math.toRadians(savannahY - atlantaY)));

        double distanceFromCharlotteToAtlanta = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(atlantaX)) +
                        Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaX)) *
                                Math.cos(Math.toRadians(charlotteY - atlantaY)));

        double distanceFromCharlotteToSavannah = AVERAGE_EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(savannahX)) +
                        Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahX)) *
                                Math.cos(Math.toRadians(charlotteY - savannahY)));

        double s1 = (distanceFromOrlandoToSavannah + distanceFromOrlandoToAtlanta + distanceFromSavannahToAtlanta) / 2;
        double s2 = (distanceFromSavannahToAtlanta + distanceFromCharlotteToAtlanta + distanceFromCharlotteToSavannah) / 2;

        double areaOfTriangle1 = Math.sqrt(s1 * (s1 - distanceFromOrlandoToSavannah) * (s1 - distanceFromOrlandoToAtlanta) *
                (s1 -distanceFromSavannahToAtlanta));

        double areaOfTriangle2 = Math.sqrt(s2 * (s2 - distanceFromSavannahToAtlanta) * (s2 - distanceFromCharlotteToAtlanta) *
                (s2 - distanceFromCharlotteToSavannah));

        double estimatedEnclosedArea = areaOfTriangle1 + areaOfTriangle2;

        System.out.println("Estimated area enclosed by these for cities : " + estimatedEnclosedArea);

    }
}
