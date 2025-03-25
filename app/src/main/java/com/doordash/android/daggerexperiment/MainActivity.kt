package com.doordash.android.daggerexperiment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.fragment
import com.doordash.android.daggerexperiment.ui.theme.DaggerExperimentTheme
import com.doordash.android.home.HomeFragment
import com.doordash.android.home.HomeNavRoutes
import com.doordash.android.merchant.MerchantFragment
import com.doordash.android.merchant.MerchantNavRoutes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.main_activity)
        setTheme(R.style.Theme_DaggerExperiment)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        createNavigationGraph()
    }

    private fun createNavigationGraph() {
        navController.graph = navController.createGraph(startDestination = HomeNavRoutes.home) {
            fragment<HomeFragment>(HomeNavRoutes.home)
            fragment<MerchantFragment>(MerchantNavRoutes.merchant)
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerExperimentTheme {
        Greeting("Android")
    }
}