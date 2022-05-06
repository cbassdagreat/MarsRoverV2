package cbassdagreat.github.marsroverv2.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cbassdagreat.github.marsroverv2.databinding.FragmentMainBinding
import com.squareup.picasso.Picasso


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    private val mHandler: Handler = Handler(Looper.getMainLooper())
    var imageUri1 = "https://static0.thethingsimages.com/wordpress/wp-content/uploads/2019/08/Coffin-via-the13thfloor.tv_.jpg?q=50&fit=crop&w=740&dpr=1.5"
    var imageUri2 ="https://static0.thethingsimages.com/wordpress/wp-content/uploads/2019/08/Pyramid-via-scribol.com_.jpg?q=50&fit=crop&w=740&dpr=1.5"
    var imageUri3 ="https://static0.thethingsimages.com/wordpress/wp-content/uploads/2019/08/Crab-via-the13thfloor.tv_.jpg?q=50&fit=crop&w=740&dpr=1.5"
    var imageUri4 ="https://static0.thethingsimages.com/wordpress/wp-content/uploads/2019/08/f-mars.png?q=50&fit=contain&w=960&h=500&dpr=1.5"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)

        with(binding)
        {
            fbtn1.setOnClickListener{
                progressBar.visibility=View.VISIBLE

                mHandler.post(Runnable {
                    Thread.sleep(1000)
                    Picasso.get().load(imageUri1).into(imageView)
                    progressBar.visibility = View.INVISIBLE
                })

                progressBar2.visibility = View.VISIBLE

                mHandler.post(Runnable {
                    Thread.sleep(1000)
                    Picasso.get().load(imageUri2).into(imageView2)
                    progressBar2.visibility = View.INVISIBLE

                })

                progressBar3.visibility = View.VISIBLE

                mHandler.post(Runnable {
                    Thread.sleep(1000)
                    Picasso.get().load(imageUri3).into(imageView3)
                    progressBar3.visibility = View.INVISIBLE

                })

                progressBar4.visibility = View.VISIBLE

                mHandler.post(Runnable {
                    Thread.sleep(1000)
                    Picasso.get().load(imageUri4).into(imageView4)
                    progressBar4.visibility = View.INVISIBLE

                })


            }

        }
        return binding.root
    }

    fun loadImages()
    {

       with(binding)
       {

           Picasso.get().load(imageUri1).into(imageView)
           progressBar.visibility = View.INVISIBLE

           Picasso.get().load(imageUri2).into(imageView2)
           progressBar2.visibility = View.INVISIBLE

           Picasso.get().load(imageUri3).into(imageView3)
           progressBar3.visibility = View.INVISIBLE

           Picasso.get().load(imageUri4).into(imageView4)
           progressBar4.visibility = View.INVISIBLE

       }
    }

   /** fun thread(
        start: Boolean = true,
        isDaemon: Boolean = false,
        contextClassLoader: ClassLoader? = null,
        name: String? = null,
        priority: Int = -1,
        block: () -> Unit
    ):
**/



}