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
import { mdiHomeCity, mdiInformation, mdiAccountBoxOutline } from '@mdi/js'
export default {
  data () {
    return {
      drawer: true,
      sideMenuItems: [
        { title: 'Home', value: 'home', prependIcon: mdiHomeCity, to: '/' },
        { title: 'About', value: 'about', prependIcon: mdiInformation, to: '/about'},
        { title: 'TestUsers', value: 'testUsers', prependIcon: mdiAccountBoxOutline, to: '/testUser' },
      ],
    }
  }
}
</script>
