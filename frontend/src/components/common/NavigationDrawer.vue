<template>
  <v-navigation-drawer
    permanent
  >
    <v-list nav density="compact">
      <template v-for="sideMenuItem in sideMenuItems" :key="sideMenuItem.value">
        <v-list-item
          density="compact"
          :prepend-icon="sideMenuItem.prependIcon"
          :title="sideMenuItem.title"
          :value="sideMenuItem.value"
          :to="sideMenuItem.to"
        />
      </template>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  data () {
    return {
      drawer: true,
      sideMenuItems: [
        { title: 'Home', value: 'home', prependIcon: 'mdi-home-city', to: '/' },
        { title: 'About', value: 'about', prependIcon: 'mdi-information', to: '/about'},
        { title: 'TestUsers', value: 'testUsers', prependIcon: 'mdi-account-box-outline', to: '/users' },
      ],
    }
  }
}
</script>
