class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def reverse_list(head: ListNode) -> ListNode:
    prev = None
    curr = head

    while curr is not None:
        curr.next, prev, curr = prev, curr, curr.next

    return prev
