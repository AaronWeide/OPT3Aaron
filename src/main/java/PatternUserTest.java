import org.junit.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;

class PatternUserTest {

    @org.junit.jupiter.api.Test
    @Test
    void pairwisetesingStudents(){

    Student StudentA = new Student();
    StudentA.setUserrank(1);
    StudentA.setlicentie(true);
    StudentA.setLoggedInStatus(true);
    StudentA.setKleurenblind(true);

    Student StudentB = new Student();
    StudentB.setUserrank(1);
    StudentB.setlicentie(false);
    StudentB.setLoggedInStatus(false);
    StudentB.setKleurenblind(false);

    assertEquals(StudentA.getUserrank(), 1);
    assertTrue(StudentA.getlicentie());
    assertTrue(StudentA.getLoggedInStatus());
    assertTrue(StudentA.getKleurenblind());

    assertEquals(StudentB.getUserrank(), 1);
    assertFalse(StudentB.getlicentie());
    assertFalse(StudentB.getLoggedInStatus());
    assertFalse(StudentB.getKleurenblind());


    }

    @Test
    void pairwisetesingVolwasseStudent(){

        Volwassenstudent VstudentA = new Volwassenstudent();
        VstudentA.setUserrank(2);
        VstudentA.setlicentie(true);
        VstudentA.setLoggedInStatus(false);
        VstudentA.setKleurenblind(true);

        Volwassenstudent VstudentB = new Volwassenstudent();
        VstudentA.setUserrank(2);
        VstudentA.setlicentie(false);
        VstudentA.setLoggedInStatus(true);
        VstudentA.setKleurenblind(false);


        assertEquals(VstudentA.getUserrank(), 2);
        assertTrue(VstudentA.getlicentie());
        assertFalse(VstudentA.getLoggedInStatus());
        assertTrue(VstudentA.getKleurenblind());

        assertEquals(VstudentB.getUserrank(), 2);
        assertFalse(VstudentB.getlicentie());
        assertTrue(VstudentB.getLoggedInStatus());
        assertFalse(VstudentB.getKleurenblind());


    }

    @Test
    void PairwisetestingDocent(){

        Docent DocentA = new Docent();
        DocentA.setUserrank(3);
        DocentA.setlicentie(true);
        DocentA.setLoggedInStatus(true);
        DocentA.setKleurenblind(false);

        Docent DocentB = new Docent();
        DocentB.setUserrank(3);
        DocentB.setlicentie(false);
        DocentB.setLoggedInStatus(false);
        DocentB.setKleurenblind(true);


        assertEquals(DocentA.getUserrank(), 3);
        assertTrue(DocentA.getlicentie());
        assertTrue(DocentA.getLoggedInStatus());
        assertFalse(DocentA.getKleurenblind());

        assertEquals(DocentB.getUserrank(), 3);
        assertFalse(DocentB.getlicentie());
        assertFalse(DocentB.getLoggedInStatus());
        assertTrue(DocentB.getKleurenblind());




    }


}