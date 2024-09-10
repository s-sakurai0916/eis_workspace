<template>
  <v-app>
    <v-system-bar color="secondary">
      System Bar
    </v-system-bar>

    <v-app-bar color="primary">
      <v-app-bar-title>
        Application Bar
      </v-app-bar-title>
    </v-app-bar>

    <v-navigation-drawer permanent>
      <nav>
        <router-link to="/">Home</router-link>
        <router-link to="/about">About</router-link>
        <router-link to="/testUser">テストユーザ</router-link>
      </nav>
    </v-navigation-drawer>

    <v-main>
      <router-view/>
    </v-main>

    <v-bottom-navigation>
      Button Navigation
    </v-bottom-navigation>

    <v-footer color="primary" app>
      Footer
    </v-footer>

  </v-app>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
