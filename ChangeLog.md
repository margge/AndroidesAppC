Androides App - Chokis
========

# Tasks
- Create Splash Screen - Okay
- Add animation to Splash Screen - Okay
- Create and empty activity call MenuActivity - Pending
- Launch MenuActivity when animation in SplashActivity is loaded - Pending
  
  Use this code as reference:
   
    private fun loadMenuScreen() {
        val runnable = Runnable {
            startActivity(Intent(this, MenuActivity::class.java))
        }
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, 2000)
    }
    
- Create Pull Request to develop branch - Pending