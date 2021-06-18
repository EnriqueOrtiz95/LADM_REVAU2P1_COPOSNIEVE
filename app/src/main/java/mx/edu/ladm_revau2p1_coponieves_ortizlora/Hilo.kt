package mx.edu.ladm_revau2p1_coponieves_ortizlora


class Hilo(p: MainActivity) : Thread() {
    var puntero = p
    var figura: FiguraGeometrica? = null

    override fun run() {
        super.run()
        fun esperar(segundos: Long) {
            try {
                Thread.sleep(segundos * 500)

            } catch (e: Exception) {
                println(e)
            }
        }
        esperar(2)
        while (true) {
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}