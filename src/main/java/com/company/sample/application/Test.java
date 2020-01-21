/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
package com.company.sample.application;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.codeguruprofilerjavaagent.Profiler;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowCount = sc.nextInt();
        ArrayList<Integer> list = null;
        for (int i = 0; i < rowCount; i++) {
            int columnCount = sc.nextInt();
            list = new ArrayList();
            list.add(columnCount);
            for (int j = 0; j < columnCount ; j++) {
                list.add(sc.nextInt());
            }

            int sum = 0;
            for (int j = 1; j < list.size(); j++) {
               sum+= list.get(j);
            }
            int average = sum/(list.size()-1);

            int goodStudent = 0;
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(j) > average) {
                    goodStudent++;
                }
            }

            //int value = goodStudent / (list.size() - 1 * 100);
            //double value = ((list.size()-1) * 100) / (double)goodStudent;
            int total = list.size() - 1;
            double rate = ((double)goodStudent/ (double)total) * 100;
            //String dispPattern = "#.000";
            //DecimalFormat form = new DecimalFormat(dispPattern);

            //System.out.println(Math.round(rate* 100) / 100.0 + "%");

            //System.out.printf("%.2f,rate");
            System.out.printf("%.3f", rate).println("%");

        }
        sc.close();
    }
}