<template>
  <v-app>
    <SystemBar />
    <AppBar />
    <NavigationDrawer />

    <v-main>
      <router-view/>
    </v-main>

    <BottomNavigation />
    <FooterBar />
  </v-app>
</template>

<script>
import AppBar from "./components/common/AppBar.vue";
import BottomNavigation from "./components/common/BottomNavigation.vue";
import NavigationDrawer from "./components/common/NavigationDrawer.vue";
import SystemBar from "./components/common/SystemBar.vue";
import FooterBar from "./components/common/FooterBar.vue";

export default {
  components: { AppBar, BottomNavigation, NavigationDrawer, FooterBar, SystemBar  }
};
</script>