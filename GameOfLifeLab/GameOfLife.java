import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 25 rows and 25 columns
    private final int ROWS = 25;
    private final int COLS = 25;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        

    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 0, Y1 = 4;
        final int X2 = 1, Y2 = 3;
        final int X3 = 1, Y3 = 5;
        final int X4 = 2, Y4 = 2;
        final int X5 = 2, Y5 = 6;
        final int X6 = 3, Y6 = 1;
        final int X7 = 3, Y7 = 3;
        final int X8 = 3, Y8 = 5;
        final int X9 = 3, Y9 = 7;
        final int X10 = 4, Y10 = 0;
        final int X11 = 4, Y11 = 4;
        final int X12 = 4, Y12 = 8;
        final int X13 = 5, Y13 = 1;
        final int X14 = 5, Y14 = 3;
        final int X15 = 5, Y15 = 5;
        final int X16 = 5, Y16 = 7;
        final int X17 = 6, Y17 = 2;
        final int X18 = 6, Y18 = 6;
        final int X19 = 7, Y19 = 3;
        final int X20 = 7, Y20 = 5;
        final int X21 = 8, Y21 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);

        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);

        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);

        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);

        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);

        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);

        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, rock7);

        Rock rock8 = new Rock();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, rock8);

        Rock rock9 = new Rock();
        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, rock9);

        Rock rock10 = new Rock();
        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, rock10);

        Rock rock11 = new Rock();
        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, rock11);

        Rock rock12 = new Rock();
        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, rock12);

        Rock rock13 = new Rock();
        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, rock13);

        Rock rock14 = new Rock();
        Location loc14 = new Location(Y14, X14);
        grid.put(loc14, rock14);

        Rock rock15 = new Rock();
        Location loc15 = new Location(Y15, X15);
        grid.put(loc15, rock15);

        Rock rock16 = new Rock();
        Location loc16 = new Location(Y16, X16);
        grid.put(loc16, rock16);

        Rock rock17 = new Rock();
        Location loc17 = new Location(Y17, X17);
        grid.put(loc17, rock17);

        Rock rock18 = new Rock();
        Location loc18 = new Location(Y18, X18);
        grid.put(loc18, rock18);

        Rock rock19 = new Rock();
        Location loc19 = new Location(Y19, X19);
        grid.put(loc19, rock19);

        Rock rock20 = new Rock();
        Location loc20 = new Location(Y20, X20);
        grid.put(loc20, rock20);

        Rock rock21 = new Rock();
        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, rock21);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        // insert magic here...
        BoundedGrid<Actor> newgrid = new BoundedGrid<Actor>(ROWS, COLS);

        int col = getNumCols();
        int row = getNumRows();
        for (int column = 0; column < col; column++)
        {
            for (int rows = 0; rows < row; rows++)
            {
                Actor cell = getActor(rows, column);
                Location location = new Location(rows, column);
                if (cell != null)
                {
                    ArrayList<Actor> Neighbors = grid.getNeighbors(location);
                    int Neighborscount = Neighbors.size();
                    if (Neighborscount == 3)
                    {
                        //lives
                        Rock newrock1 = new Rock();
                        Location newloc1 = new Location(rows, column);
                        newgrid.put(newloc1, newrock1);
                    }
                    else if (Neighborscount == 2)
                    {
                        //lives
                        Rock newrock1 = new Rock();
                        Location newloc1 = new Location(rows, column);
                        newgrid.put(newloc1, newrock1);
                    }
                    else if (Neighborscount < 3)
                    {
                        //dies
                    }
                    else if (Neighborscount > 3)
                    {
                        //dies
                    }
                }
                else if (cell == null)
                {
                    ArrayList<Actor> Neighbors = grid.getNeighbors(location);
                    int Neighborscount = Neighbors.size();
                    if (Neighborscount == 3)
                    {
                        //reborn
                        Rock newrock1 = new Rock();
                        Location newloc1 = new Location(rows, column);
                        newgrid.put(newloc1, newrock1);
                    }
                }
            }
        }
        world.setGrid(newgrid);
        world.show();
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
