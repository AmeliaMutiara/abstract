/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author zyrex
 */
class KelasAbstrak {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Burung b = new Burung();
        h.berjalan();
        h.bernafas();
        b.berjalan();
        b.bernafas();
    }
}
