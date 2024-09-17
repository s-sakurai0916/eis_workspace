<template>
  <v-container>
    <p class="text-h3">TestUser</p>
    <v-btn @click="openDialog('create')">新規登録</v-btn>
    <v-btn @click="openDialog('edit', existingData)">編集</v-btn>
    <v-text-field
        v-model="search"
        append-icon="mdi-magnify"
        label="検索"
        single-line
        hide-details
      ></v-text-field>
    <v-data-table
      v-model:items-per-page="itemsPerPage"
      density="compact"
      :headers="headers"
      :items="testUsers"
      show-select
      @click:row="openDialog('edit', $event)"
      :items-per-page-options="pages"
      items-per-page-text="表示行数"
      class="elevation-1"
      no-data-text="データがありません。"
    ></v-data-table>

      <TestUserFormDialog
          v-model:dialog="dialog"
          :mode="mode"
          :initialData="formData"
          @create="handleCreate"
          @update="handleUpdate"
          @close="dialog = false"
       />
  </v-container>
</template>
<script>
import TestUserApiService from "../services/components/TestUserApiService";
import TestUserFormDialog from "../components/dialog/TestUserFormDialog.vue";

export default {
  components: {
    TestUserFormDialog,
  },
  name: "testUsers-list",
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
          align: 'center',
          sortable: false,
          key: 'id',
        },
        { title: 'フリガナ', align: 'center', key: 'name_ruby' },
        { title: '性別', align: 'center', key: 'gender' },
        { title: '住所', align: 'center', key: 'address' },
        { title: '登録日', align: 'center', key: 'created_date' },
        { title: '更新日', align: 'center', key: 'updated_date' },
      ],
      testUsers: [],
      dialog: false,
      mode: 'create',
      formData: {}
    };
  },
  methods: {
    retrieveTestUsers() {
      TestUserApiService.getAll()
        .then(response => {
          this.testUsers = response.data.list;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    openDialog(mode, data = {}) {
      this.mode = mode;
      this.formData = data;
      this.dialog = true;
    },
    handleCreate(data) {
      // 新規登録後の処理
      console.log('登録成功:', data);
      this.refreshList();
    },
    handleUpdate(data) {
      // 更新後の処理
      console.log('更新成功:', data);
      this.refreshList();
    },
    refreshList() {
      this.retrieveTestUsers();
    },
  },
  mounted() {
    this.retrieveTestUsers();
  }
};
</script>
