package diego.diedavq.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000) //solo para verificar su funcionamiento
        //inicialmente la aplicación se ejecuta con el tema "SplashTheme" luego que se carga el programa el tema será "AppTheme"
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
