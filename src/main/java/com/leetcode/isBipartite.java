package com.leetcode;

import java.util.Arrays;

public class isBipartite {
    private static final int UNCOLORED = 0;//表示未染色
    private static final int RED = 1;
    private static final int BLACK = 2;
    private int[] color;//表示每个节点的染色情况

    public boolean isBipartite(int[][] graph) {
        color = new int [graph.length];
        Arrays.fill(color, UNCOLORED);
        for (int i = 0; i < graph.length ; i++) {//若染色失败则直接返回false
            if (color[i] == UNCOLORED) {  //当前结点还未染色
                if (!dfs(i, RED, graph)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int i, int currentColor, int[][] graph) {
        //为当前节点染色
        color[i] = currentColor;
        //判断邻接结点应该染什么颜色
        int neighborColor = currentColor == RED ? BLACK : RED;
        //对邻居结点进行染色
        for (int neighbor : graph[i]) {
            if (color[neighbor] == UNCOLORED) {
                if (!dfs(neighbor,neighborColor,graph)){
                    return false;
                }
            } else if (color[neighbor]==currentColor){//邻居已被染色,且和当前结点颜色相同则说明不是二分图，染色失败
                return false;
            }
        }
        return true;
    }

}
