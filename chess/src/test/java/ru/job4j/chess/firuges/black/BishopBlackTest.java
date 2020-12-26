package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPositionE4() {
        Cell expected = Cell.E4;
        BishopBlack bishopBlack = new BishopBlack(expected);
        assertEquals(expected, bishopBlack.position());
    }

    @Test
    public void copyFigureE4() {
        Cell expected = Cell.E4;
        BishopBlack bishopBlack = new BishopBlack(Cell.A4);
        Figure copyBishopBlack = bishopBlack.copy(Cell.E4);
        assertEquals(expected, copyBishopBlack.position());
    }

    @Test
    public void wayC1G5() {
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.C1, Cell.G5);
        assertArrayEquals(expected, actual);
    }
}