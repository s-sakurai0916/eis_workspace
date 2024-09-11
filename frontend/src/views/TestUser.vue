<template>
  <v-container>
    <p class="text-h3">DataTable</p>
    <v-data-table
      v-model:items-per-page="itemsPerPage"
      :headers="headers"
      :items="testUser"
      :items-per-page-options="pages"
      items-per-page-text="表示行数"
      class="elevation-1"
    ></v-data-table>
  </v-container>
</template>

<script>
export default {
  data () {
    return {

      itemsPerPage: 5,
      pages: [
        {value: 5, title: '5'},
        {value: 10, title: '10'},
        {value: 20, title: '20'},
        {value: -1, title: '$vuetify.dataFooter.itemsPerPageAll'}
      ],
      headers: [
        {
          title: 'ID',
          align: 'start',
          sortable: false,
          key: 'id',
        },
        { title: 'ID', align: 'start', key: 'id' },
        { title: '名前', align: 'end', key: 'name' },
        { title: 'フリガナ', align: 'end', key: 'name_ruby' },
        { title: '性別', align: 'end', key: 'gender' },
        { title: '住所', align: 'end', key: 'address' },
        { title: '登録日, align: 'end', key: 'created_at' },
        { title: '更新日, align: 'end', key: 'updated_at' },
      ],
      testUser: [],
    }
  }
}
</script>
