package com.sman.company;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class SchoolTest {

    School school = new School("MKC");

    @Test
    public void getStudents() {

    }

    @Test
    public void getSchoolName() {
        assertEquals("MKC", school.getSchoolName());

    }
}