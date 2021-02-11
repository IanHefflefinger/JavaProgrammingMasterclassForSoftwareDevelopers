package com.company;

public class Main {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // handle invalid parameters
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        // total buckets needed
        long totalBucketsNeeded = (long) Math.ceil(area / areaPerBucket);
        // buckets after extra buckets accounted for
        long bucketsNeeded = (long) (totalBucketsNeeded - extraBuckets);

        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // handle invalid parameters
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        // total buckets needed
        long totalBucketsNeeded = (long) Math.ceil(area / areaPerBucket);

        return (int) totalBucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }

    public static void main(String[] args) {
        // test #1
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // test #2
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        // test #3
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
}
