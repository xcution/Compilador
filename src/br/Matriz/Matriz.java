
package br.Matriz;


public class Matriz {
   
    static int[][] matriz = new int[28][42];
    
    public void popula(){
        matriz[0][8] = 1;
        matriz[1][2] = 2;
        matriz[1][22] = 2;
        matriz[2][23] = 3;
        matriz[3][2] = 5;
        matriz[3][22] = 4;
        matriz[4][2] = 6;
        matriz[5][9] = 15;
        matriz[5][23] = 16;
        matriz[6][1] = 21;
        matriz[6][7] = 21;
        matriz[6][10] = 21;
        matriz[6][15] = 21;
        matriz[6][16] = 21;
        matriz[6][18] = 21;
        matriz[6][19] = 22;
        matriz[6][20] = 22;
        matriz[6][31] = 22;
        matriz[7][16] = 7;
        matriz[8][5] = 14;
        matriz[8][6] = 13;
        matriz[8][14] = 12;
        matriz[9][9] = 11;
        matriz[9][16] = 10;
        matriz[9][23] = 11;
        matriz[10][33] = 8;
        matriz[10][36] = 9;
        matriz[11][31] = 18;
        matriz[11][39] = 17;
        matriz[12][36] = 19;
        matriz[12][38] = 20;
        matriz[13][1] = 60;
        matriz[13][7] = 61;
        matriz[13][10] = 23;
        matriz[13][15] = 39;
        matriz[13][16] = 49;
        matriz[13][18] = 50;
        matriz[14][11] = 24;
        matriz[14][12] = 24;
        matriz[14][13] = 24;
        matriz[14][16] = 24;
        matriz[14][39] = 24;
        matriz[15][36] = 26;
        matriz[15][38] = 25;
        matriz[16][11] = 27;
        matriz[16][12] = 27;
        matriz[16][13] = 27;
        matriz[16][16] = 27;
        matriz[16][39] = 27;
        matriz[17][11] = 31;
        matriz[17][12] = 31;
        matriz[17][13] = 31;
        matriz[17][16] = 31;
        matriz[17][39] = 31;
        matriz[18][3] = 30;
        matriz[18][4] = 30;
        matriz[18][21] = 30;
        matriz[18][24] = 30;
        matriz[18][25] = 30;
        matriz[18][26] = 30;
        matriz[18][27] = 30;
        matriz[18][28] = 30;
        matriz[18][29] = 30;
        matriz[18][30] = 28;
        matriz[18][31] = 30;
        matriz[18][36] = 30;
        matriz[18][38] = 30;
        matriz[18][41] = 29;
        matriz[19][11] = 38;
        matriz[19][12] = 37;
        matriz[19][13] = 63;
        matriz[19][16] = 36;
        matriz[19][39] = 35;
        matriz[20][3] = 34;
        matriz[20][4] = 34;
        matriz[20][21] = 34;
        matriz[20][24] = 34;
        matriz[20][25] = 34;
        matriz[20][26] = 34;
        matriz[20][27] = 34;
        matriz[20][28] = 34;
        matriz[20][29] = 34;
        matriz[20][30] = 34;
        matriz[20][31] = 34;
        matriz[20][34] = 33;
        matriz[20][36] = 34;
        matriz[20][37] = 32;
        matriz[20][38] = 34;
        matriz[20][41] = 34;
        matriz[21][11] = 40;
        matriz[21][12] = 40;
        matriz[21][13] = 40;
        matriz[21][16] = 40;
        matriz[21][39] = 40;
        matriz[22][20] = 47;
        matriz[22][31] = 48;
        matriz[23][24] = 46;
        matriz[23][25] = 44;
        matriz[23][26] = 41;
        matriz[23][27] = 42;
        matriz[23][28] = 45;
        matriz[23][29] = 43;
        matriz[24][31] = 51;
        matriz[24][32] = 52;
        matriz[24][39] = 51;
        matriz[25][31] = 54;
        matriz[25][39] = 53;
        matriz[26][11] = 57;
        matriz[26][12] = 56;
        matriz[26][13] = 62;
        matriz[26][16] = 55;
        matriz[27][36] = 58;
        matriz[27][38] = 59;
        
    }
    
    public int buscar(int x, int val){
       x = x-42;
               
        return matriz[x][val];
        
    }
}
