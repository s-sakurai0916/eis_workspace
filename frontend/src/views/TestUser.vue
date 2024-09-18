<template>
  <v-container>
    <p class="text-h3">TestUser</p>
    <v-btn @click="createNewItem">新規登録</v-btn>
    <v-text-field
        v-model="search"
        :append-icon=mdiMagnify
        label="検索"
        single-line
        hide-details
      ></v-text-field>
    <v-data-table
      v-model:items-per-page="itemsPerPage"
      density="compact"
      :headers="headers"
      :items="items.value"
      item-value="id"
      :show-select="items.length > 0"
      @click:row="selectItem"
      :items-per-page-options="pages"
      items-per-page-text="表示行数"
      class="elevation-1"
      no-data-text="データがありません。"
    ></v-data-table>
    <TestUserFormDialog
          :data="selectedItem"
          :isEdit="isEdit"
          @close="handleClose"
          v-model:dialog="dialog"
      />
  </v-container>
</template>
<script setup lang="ts">
import { ref, onMounted  } from 'vue';
import { mdiMagnify } from '@mdi/js'
import TestUserFormDialog from "../components/dialog/TestUserFormDialog.vue";
import TestUserApiService from "../services/components/TestUserApiService";
import { Item } from '../types/components/TestUserFormDialogTypes';

const itemsPerPage = ref(5)
const pages = ref([
  {value: 5, title: '5'},
  {value: 10, title: '10'},
  {value: 20, title: '20'},
  {value: -1, title: '$vuetify.dataFooter.itemsPerPageAll'}
]);
const headers = ref([
  {
    title: 'ID',
    align: 'center',
    sortable: false,
    key: 'id'
  },
  { title: '名前', align: 'center', key: 'name' },
  { title: 'フリガナ', align: 'center', key: 'name_ruby' },
  { title: '性別', align: 'center', key: 'gender' },
  { title: 'メールアドレス', align: 'center', key: 'email' },
  { title: '郵便番号', align: 'center', key: 'postal_code' },
  { title: '住所', align: 'center', key: 'address' },
  { title: '登録日', align: 'center', key: 'created_date' },
  { title: '更新日', align: 'center', key: 'updated_date' }
]);

const items = ref<Item[]>([]);

const selectedItem = ref<Item | null>(null);
const dialog = ref(false);
const isEdit = ref(false);

const retrieveTestUsers = () => {
  TestUserApiService.getAll()
  .then(response => {
    items.value = response.data.list;
    console.log(response.data);
  })
  .catch(e => {
    console.log(e);
  });
};
const createNewItem = () => {
  isEdit.value = false;
  dialog.value = true;
};

const selectItem = (item: Item) => {
  selectedItem.value = { ...item };
  isEdit.value = true;
  dialog.value = true;
};

const handleClose = (updatedData: Item) => {
  if (isEdit.value) {
    // 編集モードの場合、既存のアイテムを更新
    const index = items.value.findIndex(i => i.id === updatedData.id);
    if (index !== -1) {
      items.value[index] = updatedData;
    }
  } else {
    // 新規登録モードの場合、新しいアイテムを追加
    items.value.push(updatedData);
  }
  dialog.value = false;
  retrieveTestUsers();
};

onMounted(() => {
  retrieveTestUsers();
});

</script>
