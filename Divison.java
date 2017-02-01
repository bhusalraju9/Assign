package com.cubic.assignemnt.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Divison {
	ArrayList<Integer> p = new ArrayList<Integer>(); // creating object of integer array
	

void divd() {

System.out.println(" Enter number betwee 100 and 700");
Scanner x= new Scanner(System.in);
int y= x.nextInt();

for (int i = 2; i <= y; i++) {
	while (y % i == 0) {
		p.add(i);
		y = y / i;

public static void main(String[] args) {
	

