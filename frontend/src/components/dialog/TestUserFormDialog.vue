<template>
  <v-dialog v-model="dialog" max-width="500px">
    <template v-slot:activator="{ on, attrs }">
      <v-btn color="primary" v-bind="attrs" v-on="on">テストユーザ登録フォーム</v-btn>
    </template>
    <v-card>
      <v-card-title>
        <span class="headline">テストユーザ{{ isEditMode ? '編集' : '新規登録' }}フォーム</span>
      </v-card-title>
      <v-card-text>
        <v-form ref="form">
          <v-text-field v-model="formData.name" label="名前" required></v-text-field>
          <v-text-field v-model="formData.email" label="メール" required></v-text-field>
        </v-form>
      </v-card-text>
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn color="blue darken-1" text @click="closeDialog">キャンセル</v-btn>
        <v-btn color="blue darken-1" text @click="submit">{{ isEditMode ? '更新' : '登録' }}</v-btn>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script lang="ts">
import { defineComponent, ref, computed, toRefs } from 'vue';
import { FormData, initialFormData } from '../../types/components/TestUserFormDialogTypes';
import TestUserApiService from '../../services/components/TestUserApiService';

export default defineComponent({
  props: {
    dialog: Boolean,
    mode: {
      type: String,
      required: true,
      validator: (value: string) => ['create', 'edit'].includes(value)
    },
    initialData: {
      type: Object as () => FormData,
      default: () => ({ ...initialFormData })
    }
  },
  setup(props, { emit }) {
    const { dialog, mode, initialData } = toRefs(props);
    const formData = ref({ ...initialData.value } as FormData);
    const form = ref();

    const isEditMode = computed(() => mode.value === 'edit');

    const closeDialog = () => {
      emit('close');
    };

    const submit = async () => {
      if (form.value) {
        form.value.validate();
      }
      try {
        if (isEditMode.value) {
          TestUserApiService.update(formData.value.id, formData.value);
          emit('update');
        } else {
          TestUserApiService.create(formData.value);
          emit('create');
        }
        closeDialog();
      } catch (error) {
        console.error('エラー:', error);
      }
    };

    return {
      dialog,
      formData,
      form,
      isEditMode,
      closeDialog,
      submit
    };
  }
});
</script>