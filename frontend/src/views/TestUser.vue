<template>
  <v-container>
    <v-row>
      <v-col cols="10">
        <v-data-table
          :headers="headers"
          :items="serverData"
        ></v-data-table>
      </v-col>
      </v-row>
  </v-container>
</template>
<script>
export default {

  data() {
    return {
      headers: [
          {
            text: 'ID',
            value: 'id'
          },
          {
            text: '名前',
            value: 'name',
          },
          {
            text: 'フリガナ',
            value: 'name_ruby',
          },
          {
            text: '性別',
            value: 'gender',
          },
          {
            text: '住所',
            value: 'address',
          },
          { text: '登録日',
            value: 'created_at'
          },
          { text: '更新日',
            value: 'updated_at'
          },
        ],
      serverData: [],
    }
  },

}
</script>
