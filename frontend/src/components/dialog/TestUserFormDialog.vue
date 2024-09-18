<template>
  <v-dialog v-model="dialog" max-width="500px">
    <v-card>
      <v-card-title>{{ isEdit ? 'データ編集' : '新規登録' }}</v-card-title>
      <v-card-text>
        <v-form ref="form">
          <v-text-field v-model="localData.name" label="名前" required></v-text-field>
          <v-text-field v-model="localData.email" label="メール" required></v-text-field>
        </v-form>
      </v-card-text>
      <v-card-actions>
        <v-btn @click="closeDialog">キャンセル</v-btn>
        <v-btn @click="saveData">{{ isEdit ? '更新' : '登録' }}</v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script setup lang="ts">
import { ref, watch, defineProps, defineEmits } from 'vue';
import TestUserApiService from '../../services/components/TestUserApiService';
import { Item, defaultItem } from '../../types/components/TestUserFormDialogTypes';

const props = defineProps<{
  data: Item | null;
  isEdit: boolean;
  modelValue: boolean;
}>();
const emit = defineEmits(['update:modelValue', 'close']);

const dialog = ref(props.modelValue);
const localData = ref<Item>({ ...defaultItem });

watch(() => props.modelValue, (newVal) => {
  dialog.value = newVal;
});

watch(dialog, (newVal) => {
  emit('update:modelValue', newVal);
});

watch(() => props.data, (newVal) => {
  if (newVal) {
    localData.value = { ...newVal };
  }
});

const closeDialog = () => {
  dialog.value = false;
};

const saveData = async () => {
  try {
    if (props.isEdit) {
      // 編集モードの場合
      TestUserApiService.update(localData.value.id, localData.value);
      console.log('Data updated');
    } else {
      // 新規登録モードの場合
      TestUserApiService.insert(localData.value);
      console.log('Data created');
    }
    emit('close', localData.value);
    dialog.value = false;
  } catch (error) {
    console.error('Error saving data:', error);
  }
};
</script>